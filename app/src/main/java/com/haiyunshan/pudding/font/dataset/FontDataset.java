package com.haiyunshan.pudding.font.dataset;

import com.haiyunshan.pudding.dataset.BaseDataset;

public class FontDataset extends BaseDataset<FontEntry> {

    public FontEntry obtainBySource(String source) {
        for (FontEntry item : mList) {
            if (item.mSource.equalsIgnoreCase(source)) {
                return item;
            }
        }

        return null;
    }
}
