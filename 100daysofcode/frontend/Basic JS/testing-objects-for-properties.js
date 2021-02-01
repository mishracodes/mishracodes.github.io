function checkObj(obj, checkProp) {
  // Only change code below this line
 var ispre=obj.hasOwnProperty(checkProp);
 
  if(ispre){
    return obj[checkProp];
  }
  return "Not Found";
  // Only change code above this line
}