ActionBar actionBar = getActionBar(); actionBar.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.parseColor("#191919")));
if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
    Window w = MainActivity.this.getWindow();
    w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
    w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
    w.setStatusBarColor(Color.parseColor("#000000"));
} 
