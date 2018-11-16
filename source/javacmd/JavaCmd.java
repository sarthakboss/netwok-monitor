/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacmd;

import java.io.*;

public class JavaCmd {
    public static void main(String[] args) throws Exception {
        ProcessBuilder builder = new ProcessBuilder(
            "cmd.exe", "/c", "netstat -a");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }
    }
}
