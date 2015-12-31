/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realworld;

import GUIs.MainScreen;
import com.firebase.client.Firebase;
import com.pearson.pdn.learningstudio.oauth.OAuth2PasswordService;
import com.pearson.pdn.learningstudio.oauth.OAuthServiceFactory;
import com.pearson.pdn.learningstudio.oauth.config.OAuthConfig;
import com.pearson.pdn.learningstudio.oauth.request.OAuth2Request;
import java.awt.FlowLayout;
import org.jdesktop.swingx.JXButton;
import org.jdesktop.swingx.JXFrame;
import org.jdesktop.swingx.JXLoginPane;
import org.jdesktop.swingx.JXPanel;
import org.jdesktop.swingx.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import pearson.AuthenticationData;

/**
 *
 * @author Nathan Smith
 */
public class RealWorld {

    static JXFrame mainFrame;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        mainFrame = new JXFrame();
        mainFrame.setExtendedState(JXFrame.MAXIMIZED_BOTH);
        mainFrame.setDefaultCloseOperation(JXFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        mainFrame.add(new LoginPanel());

        mainFrame.setVisible(true);

    }

    void loadNewPanel(Component com) {
        mainFrame.removeAll();
        mainFrame.add(com);
        mainFrame.revalidate();
    }

}

class LoginPanel extends JXPanel implements ActionListener {

    Firebase ref = new Firebase("https://glowing-inferno-9149.firebaseio.com/RealWorld");
    JXLoginPane newPane;

    LoginPanel() {
        initComponents();
    }

    
    private void initComponents() {
        newPane = new JXLoginPane();
        newPane.setBannerText("RealWorld");
        newPane.setErrorMessage("Error");
        newPane.setSize(100, 100);

        JXButton newButton = new JXButton("Login");
        newButton.addActionListener(this);

       /* MattePainter mp = new MattePainter(Colors.LightBlue.alpha(0.5f));
        GlossPainter gp = new GlossPainter(Colors.White.alpha(0.3f), GlossPainter.GlossPosition.TOP);
       PinstripePainter pp = new PinstripePainter(Colors.Gray.alpha(0.2f), 45d);
        this.setBackgroundPainter(new CompoundPainter(mp, pp, gp) );*/

        this.setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        c.gridy = 0;
        c.insets = new Insets(100, 100, 100, 100);
        this.add(new Label(), c);

        c.gridy = 1;
        c.insets = new Insets(0, 0, 0, 0);
        this.add(newPane, c);

        c.gridy = 2;
        this.add(newButton, c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String applicationId = "15e4295d-3df5-4ae8-9727-b6a821003dd9";   // Identifies your Application
        String applicationName = "RealWorld";   // No spaces for best results (e.g., MyAppName)
        String tokenKeyMoniker = "04b11650-b3bb-41d6-91a6-c19936aaf4e5";
        String sharedSecret = "8a72063be6d0409da86a5c239e39fd10";
        String clientString = "gbtestc";
        String userName = "nsmith145537.teacher@troy.edu";
        String password = "XCFdPxKP";

        OAuthConfig config = new OAuthConfig();
        config.setApplicationId(applicationId);
        config.setApplicationName(applicationName);  	// Needed only for OAuth 2 Assertion 
        config.setConsumerKey(tokenKeyMoniker);
        config.setConsumerSecret(sharedSecret);        	// Needed only for OAuth 1 & OAuth 2 Assertion 
        config.setClientString(clientString);	      	// Needed only for OAuth 2

        OAuthServiceFactory oauthFactory = new OAuthServiceFactory(config);
        OAuth2PasswordService oauthService = oauthFactory.build(OAuth2PasswordService.class);

        try {
            URL apiUrl = new URL("https://api.learningstudio.com/me");
            OAuth2Request oauthRequest = oauthService.generateOAuth2PasswordRequest(userName, password);
            Map httpHeaders = oauthRequest.getHeaders();
            HttpsURLConnection httpConn = (HttpsURLConnection) apiUrl.openConnection();
            httpConn.setRequestMethod("GET");

            for (Object headerName : httpHeaders.keySet()) {
                httpConn.addRequestProperty((String) headerName, (String) httpHeaders.get(headerName));
            }

            int responseCode = httpConn.getResponseCode();
            if (responseCode == 200) {
                AuthenticationData data = new AuthenticationData(config, oauthFactory, httpHeaders, userName, password);
                MainScreen main = new MainScreen(data);
                JXFrame frame = (JXFrame) SwingXUtilities.getAncestor(JXFrame.class, getParent());
                frame.remove(LoginPanel.this);
                frame.revalidate();
                frame.add(main);
                frame.revalidate();
                frame.repaint();
            }
        }
        catch (RuntimeException rex)
        {
            throw rex;
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

}
