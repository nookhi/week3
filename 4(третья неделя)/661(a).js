
  var n=prompt('Наибольшная степень x (n): ');
  var p=new Array(n+1);
  for(var i=0;i<=n;i++){
    p[i] = prompt('Коэффициент при x (по убыванию): ');
  }
  var a=prompt('Значение а:');
  var q=new Array();
  q[0]=p[0];
  q[n+1]=-p[n]*a;
  for(var i=1; i<=n;i++){
  q[i]=p[i]-a*p[i-1];
}
alert('Новые получившиеся коэфициенты (x-a)P(x)');
alert(q);


