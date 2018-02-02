/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Marc
 */
public class lire {
    static public void read() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        String path = "src/hello/world/livres.txt";
        char[] fullSizeBuffer = new char[(int) new File(path).length()];
        FileInputStream inputStream = new FileInputStream(path);
        InputStreamReader inputReader = new InputStreamReader(inputStream, "UTF-8");
        inputReader.read(fullSizeBuffer);
        String content = new String(fullSizeBuffer);
        System.out.println(content.trim());
    }
}
