package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import com.example.ogan.tlcc.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MediaFragment extends Fragment {


    public MediaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v= inflater.inflate(R.layout.fragment_media, container, false);
        /*VideoView videoView = (VideoView) v.findViewById(R.id.view11);
        videoView.setVideoPath("/home/ogan/Desktop/TLCC/app/src/main/res/drawable/barca.mp4");
        videoView.start();*/
        return v;
    }

}
