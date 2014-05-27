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

@SuppressWarnings("all") public class chain_$Jar$Locations_0_0 extends Strategy 
{ 
  public static chain_$Jar$Locations_0_0 instance = new chain_$Jar$Locations_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_JarLocations_0_0");
    Fail27600:
    { 
      IStrategoTerm c_4512 = null;
      IStrategoTerm e_4512 = null;
      e_4512 = term;
      Success11149:
      { 
        Fail27601:
        { 
          IStrategoTerm f_4512 = null;
          IStrategoTerm h_4512 = null;
          IStrategoTerm i_4512 = null;
          h_4512 = term;
          f_4512 = generator.const7880;
          i_4512 = h_4512;
          term = dr_lookup_rule_0_2.instance.invoke(context, i_4512, f_4512, generator.constCons4561);
          if(term == null)
            break Fail27601;
          if(true)
            break Success11149;
        }
        term = generator.constNil7;
      }
      c_4512 = term;
      term = e_4512;
      term = termFactory.makeTuple(c_4512, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10216.instance);
      if(term == null)
        break Fail27600;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}