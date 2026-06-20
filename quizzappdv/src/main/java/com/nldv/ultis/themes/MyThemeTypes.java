/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nldv.ultis.themes;

import javafx.scene.Scene;

/**
 *
 * @author admin
 */
public enum MyThemeTypes {
    DEFAULT {
        @Override
        public void updateTheme(Scene scene) {
            ThemeManager.setFactory(new DefaultFactory());
            ThemeManager.applyChangeTheme(scene);
        }
    }, DARK {
        @Override
        public void updateTheme(Scene scene) {
            ThemeManager.setFactory(new DarkFactory());
            ThemeManager.applyChangeTheme(scene);
        }
    }, LIGHT {
        @Override
        public void updateTheme(Scene scene) {
            ThemeManager.setFactory(new LightFactory());
            ThemeManager.applyChangeTheme(scene);
        }
    }; 
    
    
    public abstract void updateTheme(Scene scene); 
}
