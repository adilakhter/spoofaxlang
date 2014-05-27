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

@SuppressWarnings("all") public class break_to_label_$Current$File_0_1 extends Strategy 
{ 
  public static break_to_label_$Current$File_0_1 instance = new break_to_label_$Current$File_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_4638)
  { 
    context.push("break_to_label_CurrentFile_0_1");
    Fail22982:
    { 
      IStrategoTerm o_4638 = null;
      o_4638 = term;
      term = dr_break_0_2.instance.invoke(context, o_4638, trans.const4485, m_4638);
      if(term == null)
        break Fail22982;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}