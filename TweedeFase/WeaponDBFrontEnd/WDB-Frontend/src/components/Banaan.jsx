import axios from "axios";
import { useEffect, useState } from "react";

function Banaan() {
  const [result, setResult] = useState('')

  useEffect(() => {
    const fetchData = async () => {
      const res = await axios.get("http://localhost:8080/api/v1/weapons/limited");
      setResult(res.data[0]["name"]);
    }

    fetchData();
  })

  return(
    <p>From backend: {result}</p>
  )
}

export default Banaan