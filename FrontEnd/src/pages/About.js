
import {
  Button,
  Card,
  CardBody,
  CardGroup,
  CardImg,
  CardSubtitle,
  CardText,
  CardTitle,
} from "reactstrap";
import CustomNavbar from "../components/CustomNavbar";
import Base from "./../components/Base";
const aboutus = () => {
  return (
    <div>
      
    <CustomNavbar/>

      <div
        style={{
          padding:"15px",
          backgroundColor: "#ecf6fe",
          color: "#043c6d",
        }}
      >
        <h3>About Us</h3>
      </div>

      <div class="container">
        <div class="row gy-4">
          <div class="col-lg-12">
            <p>
              Blood donation and transfusion service is an indispensable part of
              contemporary medicine and health care. Blood management has been
              recognized as a challenging task because of life threatening
              nature of blood products entails the punctilious administration
              due to its perishable nature &amp; required timely processing and
              it also saves the life.{" "}
            </p>
            <p>
              Such great challenge has been considerably alleviated with the
              development of information and computer technology. e-Blood Bank
              is an integrated blood bank automation system. This web based
              mechanism inter connects all the Blood Banks of the State into a
              single network. Integrated Blood Bank MIS refers the acquisition,
              validation, storage and circulation of various live data and
              information electronically regarding blood donation and
              transfusion service. Such system is able to assemble heterogeneous
              data into legible reports to support decision making from
              effective donor screening to optimal blood dissemination in the
              field. Those electronic processes will help the public for easy
              access to the blood availability status of blood banks on finger
              tips; so that he can place a requisition of a particular blood
              group in nearby blood bank (Especially rare groups) save a
              valuable life.
            </p>
            <p>
              It also provides online status of blood group wise availability of
              blood units in all the licensed blood banks in the state. It
              includes online tracking and trailing system of the blood and
              blood products (components of blood) by the state level
              administrators. The system manages all the activities from blood
              collection both from camps &amp; hospitals till the issue of blood
              units. It includes donor screening, blood collection, mandatory
              testing, storage and issue of the unit (whole human blood IP,
              different Blood component and aphaeresis blood products).
            </p>
            <p>
              <strong>Features:</strong>
            </p>
            <ul>
              <li>Blood Collection Management</li>
              <li>Blood Issue Management</li>
              <li>Inventory Management</li>
              <li>Stock Management</li>
              <li>Camp Management</li>
              <li>User and System Management</li>
            </ul>
            <p>
              <strong>Advantages:</strong>
            </p>
            <ul>
              <li>
                State &amp; Blood Bank dashboard to provide the group wise blood
                stocks status for all stakeholders.
              </li>
              <li>
                Dashboards for Blood Bank Officers (Tested/ Untested/ Buffer
                stock of blood units)
              </li>
              <li>
                Distribution of blood from mother blood banks to blood storage
                centers.
              </li>
              <li>
                Recruitment and retention of the regular blood donors in the
                state.{" "}
              </li>
              <li>
                Maintain all the registers according to Drugs &amp; Cosmetic Act
                of 1940.
              </li>
              <li>
                Inventory of kits and consumables with alert for short expiry.{" "}
              </li>
              <li>
                Alert mechanism for License, regular donors, organization to do
                VBD Camps.
              </li>
              <li>Provides a paperless donor room </li>
              <li>
                Real time information form collection to testing and use of
                blood and blood products.
              </li>
              <li>Unique bar coding for each blood packets.</li>
              <li>
                The citizen can access the availability of blood units from any
                blood bank of India.
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  );
};

export default aboutus;
