package cc.meet.system;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

public class BaseFragment extends Fragment {
	protected Activity parentActivity;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		parentActivity = getActivity();
		super.onCreate(savedInstanceState);
	}
}
