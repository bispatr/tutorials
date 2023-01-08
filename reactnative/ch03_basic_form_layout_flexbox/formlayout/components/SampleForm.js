import React from 'react';
import { StyleSheet, Text, View } from 'react-native';
const SampleForm = () => {
    return (
      <View style = {styles.container}>
      <View>
        <Text style={{fontSize: 12, color: "#000" }}>Log Rocket Store</Text>
      </View>
    </View>
    );
};

const styles = StyleSheet.create({
    container: {
      padding: 20,
      backgroundColor:'red'
    },
  });
  
export default SampleForm;