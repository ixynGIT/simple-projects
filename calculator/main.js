function appendToDisplay(input) {
  let display = document.getElementById("display");
  display.value += input;

  acButton.innerText = "C";
}

function clearInput() {
  let display = document.getElementById("display");
  display.value = null;

  acButton.innerText = "AC";
}

function calculate() {
  let display = document.getElementById("display");
  let expression = display.value;

  let result = eval(expression);
  display.value = result;
}

let toggled = true;
function positiveNegativeToggle() {
  toggled = !toggled;

  let display = document.getElementById("display");
  let displayValue = display.value;

  if (toggled) {
    if (displayValue[0] !== "-") {
      display.value = "-" + displayValue;
    }
  } else {
    if (displayValue[0] === "-") {
      display.value = displayValue.substring(1);
    }
  }
}

function percentage() {
  let display = document.getElementById("display");
  display.value = eval(display.value / 100);
}
