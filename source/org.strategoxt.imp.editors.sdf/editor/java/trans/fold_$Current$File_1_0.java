package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class fold_$Current$File_1_0 extends Strategy 
{ 
  public static fold_$Current$File_1_0 instance = new fold_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_92078)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_CurrentFile_1_0");
    Fail76123:
    { 
      IStrategoTerm f_92078 = null;
      IStrategoTerm h_92078 = null;
      h_92078 = term;
      Success41807:
      { 
        Fail76124:
        { 
          IStrategoTerm i_92078 = null;
          IStrategoTerm k_92078 = null;
          IStrategoTerm l_92078 = null;
          k_92078 = term;
          i_92078 = trans.const15448;
          l_92078 = k_92078;
          term = dr_lookup_rule_0_2.instance.invoke(context, l_92078, i_92078, trans.constCons7205);
          if(term == null)
            break Fail76124;
          if(true)
            break Success41807;
        }
        term = trans.constNil11;
      }
      f_92078 = term;
      term = h_92078;
      term = termFactory.makeTuple(f_92078, term);
      term = e_92078.invoke(context, term, lifted21588.instance);
      if(term == null)
        break Fail76123;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}