<html>

<link rel="stylesheet" href="resources/css/ui-lightness/jquery-ui-1.10.3.custom.css" />
<script type="text/javascript" src="resources/js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="resources/js/jquery-ui-1.10.3.custom.js"></script>

<script>
	$(function() {
		$( "#startDatePicker" ).datepicker();
		$( "#endDatePicker" ).datepicker();
	});
</script>

<body>
	<h2>Create New Event</h2>
	<table>
	<tr><td align="right">Name:</td><td><input name="eventName" type="text" id="eventName"/></td></tr>
	<tr><td align="right">Start Date:</td><td><input name="eventStartDate" type="text" id="startDatePicker"/></td></tr>
	<tr><td align="right">End Date:</td><td><input name="eventEndDate" type="text" id="endDatePicker"/></td></tr>
	</table>
</body>
</html>
