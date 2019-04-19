package com.cht.training;

import java.io.IOException;
import java.nio.file.*;

public class Main47 {
    public static void main(String[] args) throws InterruptedException {
        Path path = Paths.get(".\\data\\");
        WatchService service = null;
        try {
            service = path.getFileSystem().newWatchService();
            path.register(service, StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("start listening file system change");
        while (true){
            WatchKey key = null;
            key = service.take();
            for (WatchEvent<?> event: key.pollEvents()){
                switch (event.kind().name()){
                    case "OVERFLOW":
                        System.out.println("something not handle");
                        break;
                    case "ENTRY_MODIFY":
                        System.out.println("something being changed"+event.toString());
                        break;
                    case "ENTRY_CREATE":
                        System.out.println("something created");
                        break;

                }

            }
            key.reset();
        }

    }
}
