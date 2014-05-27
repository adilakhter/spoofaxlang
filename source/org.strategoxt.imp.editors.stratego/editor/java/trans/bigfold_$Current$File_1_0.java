package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bigfold_$Current$File_1_0 extends Strategy 
{ 
  public static bigfold_$Current$File_1_0 instance = new bigfold_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4834)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_CurrentFile_1_0");
    Fail23410:
    { 
      IStrategoTerm i_4834 = null;
      IStrategoTerm k_4834 = null;
      k_4834 = term;
      Success12580:
      { 
        Fail23411:
        { 
          IStrategoTerm l_4834 = null;
          IStrategoTerm n_4834 = null;
          IStrategoTerm o_4834 = null;
          n_4834 = term;
          l_4834 = trans.const4473;
          o_4834 = n_4834;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, o_4834, l_4834, trans.constCons2047);
          if(term == null)
            break Fail23411;
          if(true)
            break Success12580;
        }
        term = trans.constNil4;
      }
      i_4834 = term;
      term = k_4834;
      term = termFactory.makeTuple(i_4834, term);
      term = h_4834.invoke(context, term, lifted6976.instance);
      if(term == null)
        break Fail23410;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}