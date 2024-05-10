Method Override in Edit Post route
- Many web application use frameworks that only support GET and POST requests due to HTML form limitations.
- A RESTful approach would require the browser perform other methods like `PUT`, `PATCH` or `DELETE`.
- This is when Method overriding comes to rescue

Hidden input for Method override:
- Including a hidden input field in the form with a name like `_method`and setting its value to the HTTP method you like to simulate, in this case, `DELETE`. The server-side framework (Flask) then checks for this field and treats the request as a `DELETE` request even though it was technically sent as a `POST`.
