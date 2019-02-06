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
      type: "light",
      common: {
        black: "#000",
        white: "#fff"
      },
      background: {
        paper: "#fff",
        default: "#fafafa"
      },
      primary: {
        light: "#eee",
        main: "#fff",
        dark: "#e0e0e0",
        contrastText: "#07819B"
      },
      secondary: {
        light: "#07819b5e",
        main: "#07819bc9",
        dark: "#07819B",
        contrastText: "#fff"
      },
    }
  });

  export default theme;