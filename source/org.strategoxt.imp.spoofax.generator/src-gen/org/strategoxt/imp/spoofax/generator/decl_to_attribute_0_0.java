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

@SuppressWarnings("all") public class decl_to_attribute_0_0 extends Strategy 
{ 
  public static decl_to_attribute_0_0 instance = new decl_to_attribute_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail25435:
    { 
      IStrategoTerm term10030 = term;
      IStrategoConstructor cons324 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10030:
      { 
        if(cons324 == SpoofaxGenerator._consStandaloneDecl_1)
        { 
          Fail25436:
          { 
            IStrategoTerm c_4219 = null;
            IStrategoTerm arg5844 = term.getSubterm(0);
            if(arg5844.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consStandalone_1 != ((IStrategoAppl)arg5844).getConstructor())
              break Fail25436;
            c_4219 = arg5844.getSubterm(0);
            term = termFactory.makeAppl(SpoofaxGenerator._consAttribute_2, new IStrategoTerm[]{generator.constQName0, termFactory.makeAppl(SpoofaxGenerator._consDoubleQuoted_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consLiteral_1, new IStrategoTerm[]{c_4219}), (IStrategoList)generator.constNil7)})});
            if(true)
              break Success10030;
          }
          term = term10030;
        }
        Success10031:
        { 
          if(cons324 == SpoofaxGenerator._consVersionDecl_1)
          { 
            Fail25437:
            { 
              IStrategoTerm b_4219 = null;
              IStrategoTerm arg5845 = term.getSubterm(0);
              if(arg5845.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consVersion_1 != ((IStrategoAppl)arg5845).getConstructor())
                break Fail25437;
              b_4219 = arg5845.getSubterm(0);
              term = termFactory.makeAppl(SpoofaxGenerator._consAttribute_2, new IStrategoTerm[]{generator.constQName1, termFactory.makeAppl(SpoofaxGenerator._consDoubleQuoted_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consLiteral_1, new IStrategoTerm[]{b_4219}), (IStrategoList)generator.constNil7)})});
              if(true)
                break Success10031;
            }
            term = term10030;
          }
          if(cons324 == SpoofaxGenerator._consEncodingDecl_1)
          { 
            IStrategoTerm a_4219 = null;
            IStrategoTerm arg5846 = term.getSubterm(0);
            if(arg5846.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consEncoding_1 != ((IStrategoAppl)arg5846).getConstructor())
              break Fail25435;
            a_4219 = arg5846.getSubterm(0);
            term = termFactory.makeAppl(SpoofaxGenerator._consAttribute_2, new IStrategoTerm[]{generator.constQName2, termFactory.makeAppl(SpoofaxGenerator._consDoubleQuoted_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consLiteral_1, new IStrategoTerm[]{a_4219}), (IStrategoList)generator.constNil7)})});
          }
          else
          { 
            break Fail25435;
          }
        }
      }
      if(true)
        return term;
    }
    context.push("decl_to_attribute_0_0");
    context.popOnFailure();
    return null;
  }
}