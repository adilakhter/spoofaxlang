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

@SuppressWarnings("all") public class bigchain_$Main$Descriptor_0_0 extends Strategy 
{ 
  public static bigchain_$Main$Descriptor_0_0 instance = new bigchain_$Main$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_MainDescriptor_0_0");
    Fail27230:
    { 
      IStrategoTerm t_4450 = null;
      IStrategoTerm v_4450 = null;
      v_4450 = term;
      Success11046:
      { 
        Fail27231:
        { 
          IStrategoTerm w_4450 = null;
          IStrategoTerm y_4450 = null;
          IStrategoTerm z_4450 = null;
          y_4450 = term;
          w_4450 = generator.const7251;
          z_4450 = y_4450;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, z_4450, w_4450, generator.constCons4561);
          if(term == null)
            break Fail27231;
          if(true)
            break Success11046;
        }
        term = generator.constNil7;
      }
      t_4450 = term;
      term = v_4450;
      term = termFactory.makeTuple(t_4450, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10089.instance);
      if(term == null)
        break Fail27230;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}