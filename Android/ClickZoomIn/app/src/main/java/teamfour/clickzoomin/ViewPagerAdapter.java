package teamfour.clickzoomin;


import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewPagerAdapter extends PagerAdapter {

    private int[] sDrawables;
    private Context mContext;
    private ZoomTutorial mZoomTutorial;

    public ViewPagerAdapter( Context context ,int[] imgIds,ZoomTutorial zoomTutorial) {
        this.sDrawables = imgIds;
        this.mContext = context;
        this.mZoomTutorial = zoomTutorial;
    }

    @Override
    public int getCount() {
        return sDrawables.length;
    }

    @Override
    public View instantiateItem(ViewGroup container, final int position) {

        final ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(sDrawables[position]);
        container.addView(imageView, ViewPager.LayoutParams.MATCH_PARENT, ViewPager.LayoutParams.MATCH_PARENT);

        imageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mZoomTutorial.closeZoomAnim(position);
            }
        });
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

}
