<html>
<body>

 <h3>Current Date and Time is :</h3>
                <% java.util.Date d = new java.util.Date();
                out.println(d.toString()); %>
<p>An unordered list:</p>
<ul>
  <li>Sumathy</li>
  <li>Mathew</li>
  <li>Brown</li>
</ul>

<p>Click the button to display the innerHTML of the third element in the list .</p>

<button onclick="myFunction()">Click me</button>

<p id="demo"></p>

<script>
function myFunction() {
  var x = document.getElementsByTagName("LI");
  document.getElementById("demo").innerHTML = x[2].innerHTML;
}
</script>

</body>
</html>
