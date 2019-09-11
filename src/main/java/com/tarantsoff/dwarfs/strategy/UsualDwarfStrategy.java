package com.tarantsoff.dwarfs.strategy;

import com.tarantsoff.dwarfs.Context;
import com.tarantsoff.dwarfs.Dwarf;

public class UsualDwarfStrategy implements DwarfStrategy {
    @Override
    public boolean respondToCannibal(Dwarf dwarf) {
        boolean oddAlreadyBlack = !((Context.getInstance().getBlackHeatsCount() & 1) == 0);
        //System.out.println("oddAlreadyBlack = " + oddAlreadyBlack);

        boolean viewFromBehindMyBackEvenFlag = Context.getInstance().getInitialEvenFlag() ^ oddAlreadyBlack;

        return viewFromBehindMyBackEvenFlag != dwarf.getMyViewEvenFlag();
    }}
