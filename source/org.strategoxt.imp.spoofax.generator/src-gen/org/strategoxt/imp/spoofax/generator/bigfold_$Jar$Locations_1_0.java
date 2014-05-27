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

@SuppressWarnings("all") public class bigfold_$Jar$Locations_1_0 extends Strategy 
{ 
  public static bigfold_$Jar$Locations_1_0 instance = new bigfold_$Jar$Locations_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4510)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_JarLocations_1_0");
    Fail27594:
    { 
      IStrategoTerm u_4510 = null;
      IStrategoTerm w_4510 = null;
      w_4510 = term;
      Success11146:
      { 
        Fail27595:
        { 
          IStrategoTerm x_4510 = null;
          IStrategoTerm z_4510 = null;
          IStrategoTerm a_4511 = null;
          z_4510 = term;
          x_4510 = generator.const7880;
          a_4511 = z_4510;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, a_4511, x_4510, generator.constCons4561);
          if(term == null)
            break Fail27595;
          if(true)
            break Success11146;
        }
        term = generator.constNil7;
      }
      u_4510 = term;
      term = w_4510;
      term = termFactory.makeTuple(u_4510, term);
      term = t_4510.invoke(context, term, lifted10213.instance);
      if(term == null)
        break Fail27594;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}