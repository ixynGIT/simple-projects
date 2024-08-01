let inputDisplay = document.getElementById("display");
let historyDisplay = document.getElementById("history");
let acButton = document.getElementById("acButton");
let toggled = true;

function appendToDisplay(input) {
  inputDisplay.value += input;

  acButton.innerText = "C";
}

function clearInput() {
  if (acButton.innerText === "C") {
    inputDisplay.value = "";
  } else {
    inputDisplay.value = "";
    historyDisplay.value = "";
  }

  acButton.innerText = "AC";
}

function calculate() {
  let lastResult = historyDisplay.value;
  let input = inputDisplay.value;

  if (
    input.includes("+") ||
    input.includes("-") ||
    input.includes("*") ||
    input.includes("/")
  ) {
    let expression = `${lastResult}${input}`;
    try {
      let result = eval(expression);
      inputDisplay.value = "";
      historyDisplay.value = result;
    } catch (error) {
      inputDisplay.value = "error";
    }
  }

  let result = eval(input);
  historyDisplay.value = result;
  inputDisplay.value = "";
}

function positiveNegativeToggle() {
  toggled = !toggled;

  let inputDisplayValue = inputDisplay.value;

  if (toggled) {
    if (inputDisplayValue[0] !== "-") {
      inputDisplay.value = "-" + inputDisplayValue;
    }
  } else {
    if (inputDisplayValue[0] === "-") {
      inputDisplay.value = inputDisplayValue.substring(1);
    }
  }
}

function percentage() {
  inputDisplay.value = eval(inputDisplay.value / 100);
}
