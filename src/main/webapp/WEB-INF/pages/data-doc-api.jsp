<!DOCTYPE html>
<html>
<head>
  <title>Swagger UI</title>
  <link href='https://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet' type='text/css'/>
  <link href='${pageContext.request.contextPath}/asset/css/highlight.default.css' media='screen' rel='stylesheet' type='text/css'/>
  <link href='${pageContext.request.contextPath}/asset/css/screen.css' media='screen' rel='stylesheet' type='text/css'/>
  <script type="text/javascript" src="${pageContext.request.contextPath}/asset/js/shred.bundle.js"></script>
  <script src='${pageContext.request.contextPath}/asset/js/jquery-1.8.0.min.js' type='text/javascript'></script>
  <script src='${pageContext.request.contextPath}/asset/js/jquery.slideto.min.js' type='text/javascript'></script>
  <script src='${pageContext.request.contextPath}/asset/js/jquery.wiggle.min.js' type='text/javascript'></script>
  <script src='${pageContext.request.contextPath}/asset/js/jquery.ba-bbq.min.js' type='text/javascript'></script>
  <script src='${pageContext.request.contextPath}/asset/js/handlebars-1.0.0.js' type='text/javascript'></script>
  <script src='${pageContext.request.contextPath}/asset/js/underscore-min.js' type='text/javascript'></script>
  <script src='${pageContext.request.contextPath}/asset/js/backbone-min.js' type='text/javascript'></script>
  <script src='${pageContext.request.contextPath}/asset/js/swagger.js' type='text/javascript'></script>
  <script src='${pageContext.request.contextPath}/asset/js/swagger-ui.js' type='text/javascript'></script>
  <script src='${pageContext.request.contextPath}/asset/js/highlight.7.3.pack.js' type='text/javascript'></script>

  <!-- enabling this will enable oauth2 implicit scope support -->
  <%--<script src='${pageContext.request.contextPath}/asset/js/swagger-oauth.js' type='text/javascript'></script>--%>

  <script type="text/javascript">
    $(function () {
      window.swaggerUi = new SwaggerUi({
      url: "http://localhost:8080/api-docs",
      dom_id: "swagger-ui-container",
      supportedSubmitMethods: ['get', 'post', 'put', 'delete'],
      onComplete: function(swaggerApi, swaggerUi){
        log("Loaded SwaggerUI");

        if(typeof initOAuth == "function") {
          /*
          initOAuth({
            clientId: "your-client-id",
            realm: "your-realms",
            appName: "your-app-name"
          });
          */
        }
        $('pre code').each(function(i, e) {
          hljs.highlightBlock(e)
        });
      },
      onFailure: function(data) {
        log("Unable to Load SwaggerUI");
      },
      docExpansion: "none"
    });

    $('#input_apiKey').change(function() {
      var key = $('#input_apiKey')[0].value;
      log("key: " + key);
      if(key && key.trim() != "") {
        log("added key " + key);
        window.authorizations.add("key", new ApiKeyAuthorization("api_key", key, "query"));
      }
    })
    window.swaggerUi.load();
  });
  </script>
</head>

<body>
<%--<div id='header'>--%>
  <%--<div class="swagger-ui-wrap">--%>
    <%--<a id="logo" href="http://swagger.wordnik.com">swagger</a>--%>
    <%--<form id='api_selector'>--%>
      <%--<div class='input icon-btn'>--%>
        <%--<img id="show-pet-store-icon" src="${pageContext.request.contextPath}/asset/images/pet_store_api.png" title="Show Swagger Petstore Example Apis">--%>
      <%--</div>--%>
      <%--<div class='input icon-btn'>--%>
        <%--<img id="show-wordnik-dev-icon" src="${pageContext.request.contextPath}/asset/images/wordnik_api.png" title="Show Wordnik Developer Apis">--%>
      <%--</div>--%>
      <%--<div class='input'><input placeholder="http://example.com/api" id="input_baseUrl" name="baseUrl" type="text"/></div>--%>
      <%--<div class='input'><input placeholder="api_key" id="input_apiKey" name="apiKey" type="text"/></div>--%>
      <%--<div class='input'><a id="explore" href="#">Explore</a></div>--%>
    <%--</form>--%>
  <%--</div>--%>
<%--</div>--%>

<div id="message-bar" class="swagger-ui-wrap">&nbsp;</div>
<div id="swagger-ui-container" class="swagger-ui-wrap"></div>
</body>
</html>
