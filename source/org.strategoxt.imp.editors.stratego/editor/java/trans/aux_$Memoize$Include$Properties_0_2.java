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

@SuppressWarnings("all") public class aux_$Memoize$Include$Properties_0_2 extends Strategy 
{ 
  public static aux_$Memoize$Include$Properties_0_2 instance = new aux_$Memoize$Include$Properties_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_4331, IStrategoTerm k_4331)
  { 
    Fail22234:
    { 
      IStrategoTerm l_4331 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22234;
      IStrategoTerm arg7978 = term.getSubterm(0);
      if(arg7978.getTermType() != IStrategoTerm.STRING || !"-64933".equals(((IStrategoString)arg7978).stringValue()))
        break Fail22234;
      l_4331 = term.getSubterm(1);
      term = l_4331;
      if(true)
        return term;
    }
    context.push("aux_MemoizeIncludeProperties_0_2");
    context.popOnFailure();
    return null;
  }
}