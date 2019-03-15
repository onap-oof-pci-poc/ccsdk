/******************************************************************************
 * Copyright 2018 highstreet technologies GmbH
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *****************************************************************************/

import { createMuiTheme } from '@material-ui/core/styles';

const theme = createMuiTheme({
    design: {
      id: "onap",
      name: "Open Networking Automation Plattform (ONAP)",
      url: "https://www.onap.org/wp-content/uploads/sites/20/2017/02/logo_onap_2017.png",
      height: 49,
      width: 229,
      logoHeight: 32,
    },
    palette: {
      primary: {
        light: "#eeeeee",
        main: "#ffffff",
        dark: "#e0e0e0",
        contrastText: "#07819B"
      },
      secondary: {
        light: "rgba(7, 129, 155, 94)",
        main: "rgba(7, 129, 155, 201)",
        dark: "#07819B",
        contrastText: "#ffffff"
      },
    }
  });

  export default theme;