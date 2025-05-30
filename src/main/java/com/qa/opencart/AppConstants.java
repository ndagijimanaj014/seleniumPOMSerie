package com.qa.opencart;

import java.util.Arrays;
import java.util.List;

public class AppConstants {
public static final String CONFI_PROD_FILE_PATH="./src/test/resources/config/env.properties";
public static final String CONFI_QA_FILE_PATH="./src/test/resources/config/qa.properties";
public static final String CONFI_DEV_FILE_PATH="./src/test/resources/config/dev.properties";
public static final String CONFI_STAGES_FILE_PATH="./src/test/resources/config/stages.properties";
public static final String CONFI_UAT_FILE_PATH="./src/test/resources/config/UAT.properties";
public static final String LOGIN_PAGE_TITLE="Account Login";
public static final String LOGIN_PAGE_FRACTION_URL="route=account/login";
public static final String ACCOUNT_PAGE_TITLE="My Account";
public static final String ACCOUNT_PAGE_FRACTION_URL="route=account/account";
public static final  List<String> PAFE_HEADERS_LIST=Arrays.asList("My Account","My Orders","My Affiliate Account","Newsletter");

}
