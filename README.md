PagerSlidingTabStripDemo

res/values/attrs.xml

<resources>
	<declare-styleable name="PagerSlidingTabStrip">
            <attr name="slidingBlock" format="reference|color" />
	    <attr name="allowWidthFull" format="boolean" />
	    <attr name="disableViewPager" format="boolean" />
	</declare-styleable>
</resources>
---------------------------

res/values/theme_attrs.xml

<resources>
	<attr name="windows_bg" format="reference" />
	<attr name="sliding_block_bg" format="reference" />
	<attr name="lineColor" format="reference" />
</resources>
---------------------------

res/layout/base_viewpage_fragment.xml 	-->	R.layout.base_viewpage_fragment

<org.*.PagerSlidingTabStrip
	...
	android:background="?attr/windows_bg"
	app:allowWidthFull="true"
	app:slidingBlock"?attr/sliding_block_bg"/>

<View
	...
	android:background="?attr/lineColor" />
---------------------------------------

res/values/styles.xml

<style name="AppTheme" ...>
	...
	<item name="lineColor">@color/day_line_color</item>
	<item name="windows_bg">@color/day_windows_bg</item>
	<item name="sliding_block_bg">@drawable/image_sliding_block</item>
</style>
-----------------------------------------

res/values/theme_color.xml

<?xml version="1.0" encoding="utf-8"?>
<resources>
	<color name="day_line_color">#e7e7e7</color>
	<color name="day_windows_bg">#fafafa</color>
</resources>
-----------------------------------------

res/drawable

image_sliding_block.9.png
-----------------------------------------

AndroidManifest.xml

...

<application
	...
	android:theme="@style/AppTheme">

	<activity ...>
	...
	</activity>
</application>

...
-----------------------------------------

1.declare: 
res/values/theme_attrs.xml

<resources>
	<attr name="windows_bg" format="reference" />
	...
</resources>
-----------------------------------------

2.reference: 
res/layout/base_viepage_fragment.xml

<org.*.PagerSlidingTabStrip
...
android:background="?attr/windows_bg"
... />
-----------------------------------------

3.reference value: 
res/values/styles.xml

<style name="AppTheme" ...>
	...
	<item name="windows_bg">@color/day_windows_bg</item>
	...
</style>
-----------------------------------------

4.real value:
res/values/theme_color.xml

<resources>
	<color name="day_windows_bg">#fafafa</color>
</resources>
-----------------------------------------

5.use this theme:
AndroidManifes.xml

...
<application
	...
	android:theme="@style/AppTheme">

	<activity ...>
	...
	</activity>
</application>
