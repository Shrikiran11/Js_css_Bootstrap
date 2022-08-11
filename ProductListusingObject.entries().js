const product = {
    a:99,
    b:42,
    c:77,
    d:52
  };
  const a=Object.entries(product);
  console.log(Array.isArray(a));
  console.log(a);
  console.log(a.join(','));
  