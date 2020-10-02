}
@Override
public boolean onCreateOptionsMenu(Menu menu){

menu.add("Code").setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);

menu.add("MoreBlock").setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);

return true;
}

@Override 
public boolean onOptionsItemSelected(final MenuItem item) {
switch (item.getTitle().toString()) {
case "Code":
showMessage("code clicked");
return true;
case "Moreblock":
showMessage("moreblock clicked");
return true;
default:
return super.onOptionsItemSelected(item);
} 
