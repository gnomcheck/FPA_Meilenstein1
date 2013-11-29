package de.bht.fpa.mail.s786848.fsnavigation;

import java.io.File;
import java.util.ArrayList;

/*
 * The DirectoryClass is for catching the files from directory and figure out
 * if it
 */
public class Directory extends FileSystem {

  public Directory(File file) {
    super(file);
  }

  @Override
  public FileSystem[] getChildren() {

    ArrayList<FileSystem> list = new ArrayList<FileSystem>();

    try {
      for (File file : this.file.listFiles()) {
        if (file.isDirectory()) {
          list.add(new Directory(file));
        } else {
          if (file.getName().endsWith(".xml")) {
            list.add(new MyFile(file));
          }
        }
      }

      FileSystem[] listX = new FileSystem[list.size()];

      for (int i = 0; i < listX.length; i++) {
        listX[i] = list.get(i);
      }

      return listX;
    } catch (Exception e) {
      return null;
    }
  }

  @Override
  public boolean hasChildren() {
    return true;
  }
}
