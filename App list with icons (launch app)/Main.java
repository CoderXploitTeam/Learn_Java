Intent startupIntent = new Intent(Intent.ACTION_MAIN); 		
startupIntent.addCategory(Intent.CATEGORY_LAUNCHER);  		
final android.content.pm.PackageManager pm = getPackageManager(); 		
List<android.content.pm.ResolveInfo> activities = pm.queryIntentActivities(startupIntent,0);   		
Collections.sort(activities, new Comparator<android.content.pm.ResolveInfo>() {  				
public int compare(android.content.pm.ResolveInfo a, android.content.pm.ResolveInfo b) {  					
android.content.pm.PackageManager pm = getPackageManager();  					
return String.CASE_INSENSITIVE_ORDER.compare(  						
a.loadLabel(pm).toString(),  						
b.loadLabel(pm).toString());  				
}  			
});   		
ArrayAdapter<android.content.pm.ResolveInfo> adapter = new ArrayAdapter<android.content.pm.ResolveInfo>(  			
this, android.R.layout.simple_list_item_1, activities) {  			
public View getView(int pos, View convertView, ViewGroup parent) { 
TextView tv = new TextView(MainActivity.this);  				
android.content.pm.ResolveInfo ri = getItem(pos);  			
tv.setText(ri.loadLabel(pm));  	
LinearLayout lin = new LinearLayout(MainActivity.this);
ImageView iv = new ImageView(MainActivity.this);iv.setImageDrawable(ri.loadIcon(pm));
lin.addView(iv);lin.addView(tv);tv.setGravity(Gravity.CENTER_VERTICAL);
tv.setPadding(16,0,0,0);tv.setTextSize(16);
tv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT ));
LinearLayout.LayoutParams p =	new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.MATCH_PARENT);
p.width = 70;p.height = 70;p.bottomMargin = 4;p.topMargin = 4;iv.setLayoutParams(p);lin.setPadding(6,6,6,6);return lin;  			
}  		
};  		
listview1.setAdapter(adapter); 		 		
listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {  				
@Override 				
public void onItemClick(AdapterView adapter, View v, int position, long id) 				
{ 					
android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo)adapter.getItemAtPosition(position);  					android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;  					if (activityInfo == null) return;  					Intent i = new Intent(Intent.ACTION_MAIN);  					i.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);  					startActivity(i); 				}  			 		});;
