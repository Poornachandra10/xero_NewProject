package file_Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import constants.File_Constants;

public class Properties_files_Utils {

		public static String readListData(String sfilePath, String sKey) throws IOException {
			String sValue="";
			FileInputStream fis=new FileInputStream(new File(File_Constants.LOGIN_DETAILS_FILE_PATH));
		Properties p=new Properties();
		p.load(fis);
		sValue=p.getProperty(sKey);
		return sValue;
		}

	}


