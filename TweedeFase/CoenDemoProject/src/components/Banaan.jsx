import axios from "axios";
import { useEffect, useState } from "react";

function Banaan() {
  const [result, setResult] = useState('')

  useEffect(() => {
    const fetchData = async () => {
      const res = await axios.get("http://localhost:8080/api/eigenaar/findall");
      setResult(res.data[0]["name"]);
    }

    fetchData();
  })

  return(
    <p>Opgehaald uit backend: {result}</p>
  )
}

export default Banaan