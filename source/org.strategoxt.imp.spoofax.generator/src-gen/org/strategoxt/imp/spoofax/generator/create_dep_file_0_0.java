package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class create_dep_file_0_0 extends Strategy 
{ 
  public static create_dep_file_0_0 instance = new create_dep_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_dep_file_0_0");
    Fail25525:
    { 
      IStrategoTerm x_4228 = null;
      IStrategoTerm y_4228 = null;
      TermReference z_4228 = new TermReference();
      IStrategoTerm a_4229 = null;
      IStrategoTerm d_4229 = null;
      IStrategoTerm e_4229 = null;
      IStrategoTerm g_4229 = null;
      y_4228 = term;
      a_4229 = term;
      term = get_config_0_0.instance.invoke(context, generator.const6985);
      if(term == null)
        break Fail25525;
      x_4228 = term;
      term = depfile_from_config_0_0.instance.invoke(context, generator.const6968);
      if(term == null)
        break Fail25525;
      term = termFactory.makeTuple(term, generator.const6986);
      term = fopen_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25525;
      if(z_4228.value == null)
        z_4228.value = term;
      else
        if(z_4228.value != term && !z_4228.value.match(term))
          break Fail25525;
      term = a_4229;
      e_4229 = a_4229;
      IStrategoList list373;
      list373 = checkListTail(y_4228);
      if(list373 == null)
        break Fail25525;
      term = (IStrategoTerm)termFactory.makeListCons(generator.const6957, list373);
      g_4229 = term;
      term = separate_by_0_1.instance.invoke(context, g_4229, generator.const7062);
      if(term == null)
        break Fail25525;
      d_4229 = term;
      term = e_4229;
      IStrategoList list374;
      list374 = checkListTail(d_4229);
      if(list374 == null)
        break Fail25525;
      term = (IStrategoTerm)termFactory.makeListCons(x_4228, list374);
      lifted9075 lifted90750 = new lifted9075();
      lifted90750.z_4228 = z_4228;
      term = map_1_0.instance.invoke(context, term, lifted90750);
      if(term == null)
        break Fail25525;
      if(z_4228.value == null)
        break Fail25525;
      term = fclose_0_0.instance.invoke(context, z_4228.value);
      if(term == null)
        break Fail25525;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}