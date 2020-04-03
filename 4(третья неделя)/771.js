var r = prompt('Введите радиуса шара в см');
var p = prompt('Введите плотность шара от 0 до 1, т.к. плотность воды берем 1');
var pwater = 1;
var proportion = p/pwater;
var result = (r*proportion)*2;
alert('Шар погрузится на ' + result + ' см');


