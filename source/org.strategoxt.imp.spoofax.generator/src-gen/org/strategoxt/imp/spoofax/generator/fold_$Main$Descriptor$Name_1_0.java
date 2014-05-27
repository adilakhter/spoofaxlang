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

@SuppressWarnings("all") public class fold_$Main$Descriptor$Name_1_0 extends Strategy 
{ 
  public static fold_$Main$Descriptor$Name_1_0 instance = new fold_$Main$Descriptor$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4534)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_MainDescriptorName_1_0");
    Fail27726:
    { 
      IStrategoTerm c_4534 = null;
      IStrategoTerm e_4534 = null;
      e_4534 = term;
      Success11182:
      { 
        Fail27727:
        { 
          IStrategoTerm f_4534 = null;
          IStrategoTerm h_4534 = null;
          IStrategoTerm i_4534 = null;
          h_4534 = term;
          f_4534 = generator.const7897;
          i_4534 = h_4534;
          term = dr_lookup_rule_0_2.instance.invoke(context, i_4534, f_4534, generator.constCons4561);
          if(term == null)
            break Fail27727;
          if(true)
            break Success11182;
        }
        term = generator.constNil7;
      }
      c_4534 = term;
      term = e_4534;
      term = termFactory.makeTuple(c_4534, term);
      term = b_4534.invoke(context, term, lifted10259.instance);
      if(term == null)
        break Fail27726;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}