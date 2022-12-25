var isPrime = function(n) {
    for (var m = 2; m <= Math.sqrt(n); m++)
        if (n % m === 0)
            return false;
    return true;
};


function getDifference(a, b) {
    return Math.abs(a - b);
  }
  

var a = prompt("Enter a natural number:") - 0;

for (var b = a + 1; ; b++)
    if (b === 2 || isPrime(b)) {
        document.write("Prime Number immediately next to " + a + " is " + b + ".");
        document.write("\n Differnce between both of them is: "+ getDifference(a, b));
        break;
    }