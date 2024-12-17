/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class App implements NativeKeyListener {
    

    public static void main(String[] args) {
        try {
			GlobalScreen.registerNativeHook();
		}
		catch (NativeHookException ex) {
			System.err.println("There was a problem registering the native hook.");
			System.err.println(ex.getMessage());

			System.exit(1);
		}
		//==================== Login ================================
		Login login = new Login();
		GlobalScreen.addNativeKeyListener(login);
		if (login.userAuthenticated) {
			GlobalScreen.removeNativeKeyListener(login);
			Controls.clearScreen();
			//==================== Home Page ================================
			AsciiUIDesign.HomePageUi();
			
		}
		

		
		
    }

	
}
