package cc.meet.map;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cc.meet.R;
import cc.meet.system.BaseFragment;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.model.LatLng;

public class MapFragment extends BaseFragment {
	MapView mMapView = null;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		SDKInitializer.initialize(parentActivity.getApplicationContext());
		View rootView = inflater.inflate(R.layout.fragment_map_main, container,
				false);
		// ��ȡ��ͼ�ؼ�����
		mMapView = (MapView) rootView.findViewById(R.id.bmapView);

		LatLng cenpt = new LatLng(30.663791, 104.07281);
		// �����ͼ״̬
		MapStatus mMapStatus = new MapStatus.Builder().target(cenpt).zoom(12)
				.build();

		MapStatusUpdate mMapStatusUpdate = MapStatusUpdateFactory
				.newMapStatus(mMapStatus);
		// �ı��ͼ״̬
		mMapView.getMap().setMapStatus(mMapStatusUpdate);
		return rootView;
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		// ��activityִ��onDestroyʱִ��mMapView.onDestroy()��ʵ�ֵ�ͼ�������ڹ���
		mMapView.onDestroy();
	}

	@Override
	public void onResume() {
		super.onResume();
		// ��activityִ��onResumeʱִ��mMapView. onResume ()��ʵ�ֵ�ͼ�������ڹ���
		mMapView.onResume();
	}

	@Override
	public void onPause() {
		super.onPause();
		// ��activityִ��onPauseʱִ��mMapView. onPause ()��ʵ�ֵ�ͼ�������ڹ���
		mMapView.onPause();
	}
}
