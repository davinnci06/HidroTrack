package com.example.hidrotrack;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagerController extends FragmentStateAdapter {

    public PagerController(@NonNull FragmentManager fm,@NonNull Lifecycle lc) {
        super(fm, lc);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new other_energies();
            case 1:
                return new countries();
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
