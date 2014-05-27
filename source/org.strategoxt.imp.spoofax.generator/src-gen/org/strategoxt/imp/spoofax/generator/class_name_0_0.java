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

@SuppressWarnings("all") public class class_name_0_0 extends Strategy 
{ 
  public static class_name_0_0 instance = new class_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail25750:
    { 
      IStrategoTerm term10232 = term;
      IStrategoConstructor cons342 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10179:
      { 
        if(cons342 == SpoofaxGenerator._consCompilationUnit_3)
        { 
          Fail25751:
          { 
            IStrategoTerm b_4257 = null;
            IStrategoTerm arg6196 = term.getSubterm(2);
            if(arg6196.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6196).isEmpty())
              break Fail25751;
            IStrategoTerm arg6197 = ((IStrategoList)arg6196).head();
            if(arg6197.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consClassDec_2 != ((IStrategoAppl)arg6197).getConstructor())
              break Fail25751;
            IStrategoTerm arg6198 = arg6197.getSubterm(0);
            if(arg6198.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consClassDecHead_5 != ((IStrategoAppl)arg6198).getConstructor())
              break Fail25751;
            IStrategoTerm arg6200 = arg6198.getSubterm(1);
            if(arg6200.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consId_1 != ((IStrategoAppl)arg6200).getConstructor())
              break Fail25751;
            b_4257 = arg6200.getSubterm(0);
            term = b_4257;
            if(true)
              break Success10179;
          }
          term = term10232;
        }
        if(cons342 == SpoofaxGenerator._consCompilationUnit_3)
        { 
          IStrategoTerm c_4257 = null;
          IStrategoTerm arg6208 = term.getSubterm(2);
          if(arg6208.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6208).isEmpty())
            break Fail25750;
          IStrategoTerm arg6209 = ((IStrategoList)arg6208).head();
          if(arg6209.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consInterfaceDec_2 != ((IStrategoAppl)arg6209).getConstructor())
            break Fail25750;
          IStrategoTerm arg6210 = arg6209.getSubterm(0);
          if(arg6210.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consInterfaceDecHead_4 != ((IStrategoAppl)arg6210).getConstructor())
            break Fail25750;
          IStrategoTerm arg6212 = arg6210.getSubterm(1);
          if(arg6212.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consId_1 != ((IStrategoAppl)arg6212).getConstructor())
            break Fail25750;
          c_4257 = arg6212.getSubterm(0);
          term = c_4257;
        }
        else
        { 
          break Fail25750;
        }
      }
      if(true)
        return term;
    }
    context.push("class_name_0_0");
    context.popOnFailure();
    return null;
  }
}