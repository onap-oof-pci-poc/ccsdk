
import { createMuiTheme } from '@material-ui/core/styles';

const theme = createMuiTheme({
  design: {
    id: "att",
    name: "AT&T",
    url: "https://pmcvariety.files.wordpress.com/2016/04/att_logo.jpg?w=1000&h=563&crop=1",
    height: 70,
    width: 150,
    logoHeight: 60,
  },
  palette: {
    primary: {
      light: "#f2f2f29c",
      main: "#f2f2f2",
      dark: "#d5d5d5",
      contrastText: "#0094d3"
    },
    secondary: {
      light: "#f2f2f2",
      main: "rgba(51, 171, 226, 1)",
      dark: "rgba(41, 159, 213, 1)",
      contrastText: "#0094d3"
    }
  },
});

export default theme;
