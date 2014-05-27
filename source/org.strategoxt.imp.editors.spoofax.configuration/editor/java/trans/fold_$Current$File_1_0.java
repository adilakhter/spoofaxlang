package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class fold_$Current$File_1_0 extends Strategy 
{ 
  public static fold_$Current$File_1_0 instance = new fold_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4639)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_CurrentFile_1_0");
    Fail22987:
    { 
      IStrategoTerm i_4639 = null;
      IStrategoTerm k_4639 = null;
      k_4639 = term;
      Success12218:
      { 
        Fail22988:
        { 
          IStrategoTerm l_4639 = null;
          IStrategoTerm n_4639 = null;
          IStrategoTerm o_4639 = null;
          n_4639 = term;
          l_4639 = trans.const4485;
          o_4639 = n_4639;
          term = dr_lookup_rule_0_2.instance.invoke(context, o_4639, l_4639, trans.constCons2047);
          if(term == null)
            break Fail22988;
          if(true)
            break Success12218;
        }
        term = trans.constNil4;
      }
      i_4639 = term;
      term = k_4639;
      term = termFactory.makeTuple(i_4639, term);
      term = h_4639.invoke(context, term, lifted6895.instance);
      if(term == null)
        break Fail22987;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}