package com.ujm.xmltech.utils;

public class BankSimulationConstants {

  /**
   * Directory where are files to process
   */
  public final static String IN_DIRECTORY = "D:/Projets/UJM/in/";
  /**
   * Directory where are reports
   */
  public final static String OUT_DIRECTORY = "D:/Projets/UJM/out/";
  /**
   * Directory where are files under process
   */
  public final static String WORK_DIRECTORY = "D:/Projets/UJM/work/";
  /**
   * Directory where are files already processed
   */
  public final static String ARCHIVE_DIRECTORY = "D:/Projets/UJM/archive/";
  
  public final static String REJECTED_DIRECTORY = "D:/Projets/UJM/rejected/";

  /**
   * must contain only 4 upper case letters. Real example : BNPP
   */
  public final String MY_BANK_IDENTIFIER = "";

  /**
   * persistence unit name in the spring configuration
   */
  public static final String PERSISTENCE_UNIT = "bank-unit";
  /**
   * name of the transaction manager
   */
  public static final String TRANSACTION_MANAGER = "bankTransactionManager";

}
