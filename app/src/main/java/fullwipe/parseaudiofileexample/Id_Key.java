package fullwipe.parseaudiofileexample;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

public class Id_Key extends Application {

	@Override
	public void onCreate() {
		super.onCreate();


		Parse.initialize(this, "tDbZ4cFP9mPGi2ZzloC6lf30L2nYtogkXKnXmJxj", "NgUIp9ecVEkrTsjg5AFnk9w44TobLFohlyGox1uh");

		ParseUser.enableAutomaticUser();

		ParseACL defaultACL = new ParseACL();

		defaultACL.setPublicReadAccess(true);

		ParseACL.setDefaultACL(defaultACL, true);
	}

}
