package de.bht.fpa.mail.s786848.fsnavigation;

import java.io.File;

/*
 * This class represents a file and can give back the name of it
 */

public abstract class FileSystem {

  protected final File file;

  public FileSystem(File file) {
    this.file = file;
  }

  public FileSystem[] getChildren() {
    return null;
  }

  public boolean hasChildren() {
    return false;
  }

  @Override
  public String toString() {
    return this.file.getName();
  }
}