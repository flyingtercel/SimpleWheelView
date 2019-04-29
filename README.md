# SimpleWheelView
继承View实现简单的滚轮控件
![image](https://github.com/flyingtercel/SimpleWheelView/blob/master/gif/wheel.gif)

### 1添加依赖
```
    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	dependencies {
    	implementation 'com.github.flyingtercel:SimpleWheelView:1.0.4'
    }
```
### 2在布局中引用
```
    <com.mifeng.us.widget.WheelView
        android:id="@+id/mWheelView"
        android:layout_width="match_parent"
        android:layout_marginTop="35dp"
        android:layout_height="235dp"
        app:normalTextColor="#999999"
        app:normalTextSize="14sp"
        app:selectedTextColor="#333333"
        app:selectedTextSize="16sp"
        app:itemNumber="7"
        app:lineHeight="1dp"
        app:lineColor="#cc0000"
        app:isCyclic="false"
        app:noEmpty="false"/>
```
### 3设置滚动数据
```
    ArrayList<String> list = new ArrayList<>();
    for (int i = 0; i < 15; i++) {
        list.add("滑动数据第" + i + "个条目");
    }
    mWheelView.setData(list);

```
### 4设置滑动监听
```
    对滑动时间做监听
    mWheelView.setOnSelectListener(new WheelView.OnSelectListener() {
        @Override
        public void endSelect(int id, String value) {
            mTextView.setText(value);
        }
        @Override
        public void selecting(int id, String value) {
            mTextView.setText(value);
        }
    });
```